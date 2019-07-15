package com.liwy.oscafe.common.mybatis;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

/**
 * 自定义注释生成器
 *
 * @author liwy
 * @date 2019-06-06
 */
public class ModelCommentGenerator extends DefaultCommentGenerator {

    private String author = "";

    /**
     * 增加配置参数
     *
     * @param properties
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        String author = properties.getProperty("author");
        if (StringUtility.stringHasValue(author)) {
            this.author = author;
        }
    }

    /**
     * 实体类属性注释
     *
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        field.addJavaDocLine("/**");
        String remarks = introspectedColumn.getRemarks();
        if (StringUtility.stringHasValue(remarks)) {
            field.addJavaDocLine(" * " + remarks);
        }
        field.addJavaDocLine(" * ");
        field.addJavaDocLine(" * column: " + introspectedColumn.getActualColumnName());
        field.addJavaDocLine(" */");
    }

    /**
     * 实体类注释
     *
     * @param topLevelClass
     * @param introspectedTable
     */
    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        topLevelClass.addJavaDocLine("/**");
        String remarks = introspectedTable.getRemarks();
        if (StringUtility.stringHasValue(remarks)) {
            String[] remarkLines = remarks.split(System.getProperty("line.separator"));
            String[] var5 = remarkLines;
            int var6 = remarkLines.length;

            for (int var7 = 0; var7 < var6; ++var7) {
                String remarkLine = var5[var7];
                topLevelClass.addJavaDocLine(" * " + remarkLine + (var7 == 0 ? "实体类" : ""));
            }
        }
        topLevelClass.addJavaDocLine(" * ");
        topLevelClass.addJavaDocLine(" * @table " + introspectedTable.getFullyQualifiedTable());
        topLevelClass.addJavaDocLine(" * @author " + this.author);
        topLevelClass.addJavaDocLine(" * @date " + getDateString());
        topLevelClass.addJavaDocLine(" */");
    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        compilationUnit.addFileCommentLine("/*");
        compilationUnit.addFileCommentLine(" * Copy Right LIWY");
        compilationUnit.addFileCommentLine(" * http://www.oscafe.net");
        compilationUnit.addFileCommentLine(" * " + getDateString());
        compilationUnit.addFileCommentLine(" */");
    }

    /**
     * 接口方法注释
     *
     * @param method
     * @param introspectedTable
     */
    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        method.addJavaDocLine("/**");
        method.addJavaDocLine(" * " + getMethodRemark(method.getName()));
        method.addJavaDocLine(" *");

        if (method.getParameters().size() > 0) {
            for (Parameter parm : method.getParameters()) {
                method.addJavaDocLine(" * @param " + parm.getName());
            }
        }

        if (null != method.getReturnType()) {
            method.addJavaDocLine(" * @return " + method.getReturnType().getFullyQualifiedName());
        }

        method.addJavaDocLine(" */");
    }

    private String getMethodRemark(String methodName) {
        switch (methodName) {
            case "deleteByPrimaryKey":
                return "通过主键删除";
            case "insert":
                return "插入";
            case "insertSelective":
                return "可选插入";
            case "selectByPrimaryKey":
                return "通过主键查询";
            case "updateByPrimaryKeySelective":
                return "通过主键选择更新";
            case "updateByPrimaryKey":
                return "通过主键更新";
            default:
                return "";
        }
    }
}
