package com.prism.hider.modules.config.model;

/* JADX INFO: loaded from: classes6.dex */
public class DynamicModuleConfig {
    int dataVersion = 0;
    public String icon;
    public String moduleClass;
    String moduleId;
    public String name;
    public String url;

    public int getDataVersion() {
        return this.dataVersion;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getModuleClass() {
        return this.moduleClass;
    }

    public String getModuleId() {
        return this.moduleId;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setDataVersion(int i10) {
        this.dataVersion = i10;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setModuleClass(String str) {
        this.moduleClass = str;
    }

    public void setModuleId(String str) {
        this.moduleId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
