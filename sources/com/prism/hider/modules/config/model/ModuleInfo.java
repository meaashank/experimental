package com.prism.hider.modules.config.model;

import ca.c;

/* JADX INFO: loaded from: classes6.dex */
public class ModuleInfo {
    private String encodedPkg;
    private c module;
    private ModuleConfig moduleConfig;

    public ModuleInfo(ModuleConfig moduleConfig, c cVar) {
        this.moduleConfig = moduleConfig;
        this.module = cVar;
        this.encodedPkg = com.prism.hider.utils.c.g(moduleConfig.moduleId);
    }

    public int getDataVersion() {
        return this.moduleConfig.dataVersion;
    }

    public String getEncodedPkg() {
        return this.encodedPkg;
    }

    public c getModule() {
        return this.module;
    }

    public ModuleConfig getModuleConfig() {
        return this.moduleConfig;
    }

    public String getModuleId() {
        return this.moduleConfig.moduleId;
    }
}
