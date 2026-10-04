package com.prism.hider.modules.config.model;

/* JADX INFO: loaded from: classes6.dex */
public class ModuleConfig {
    public String moduleClass;
    String moduleId;
    ModuleLocation location = new ModuleLocation();
    int dataVersion = 0;

    public ModuleLocation getLocation() {
        return this.location;
    }

    public String getModuleClass() {
        return this.moduleClass;
    }

    public String getModuleId() {
        return this.moduleId;
    }

    public void setDataVersion(int i10) {
        this.dataVersion = i10;
    }

    public void setLocation(ModuleLocation moduleLocation) {
        this.location = moduleLocation;
    }

    public void setModuleClass(String str) {
        this.moduleClass = str;
    }

    public void setModuleId(String str) {
        this.moduleId = str;
    }
}
