package com.prism.hider.modules.config.model;

import ca.c;

/* JADX INFO: loaded from: classes6.dex */
public class DynamicModuleInfo {
    private String encodedPkg;
    private c module;
    private DynamicModuleConfig moduleConfig;

    public DynamicModuleInfo(DynamicModuleConfig dynamicModuleConfig, c cVar) {
        this.moduleConfig = dynamicModuleConfig;
        this.module = cVar;
        this.encodedPkg = com.prism.hider.utils.c.g(dynamicModuleConfig.moduleId);
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

    public DynamicModuleConfig getModuleConfig() {
        return this.moduleConfig;
    }

    public String getModuleId() {
        return this.moduleConfig.moduleId;
    }
}
