package com.liwy.oscafe.common.mybatis;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.List;

public class RenameJavaMapperPlugin extends PluginAdapter {

    private String suffix;

    @Override
    public boolean validate(List<String> list) {
        suffix = properties.getProperty("suffix");
        return StringUtility.stringHasValue(suffix);
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        String oldName = introspectedTable.getMyBatis3JavaMapperType();
        String newName = oldName.replace("Mapper", suffix);
        introspectedTable.setMyBatis3JavaMapperType(newName);
    }
}