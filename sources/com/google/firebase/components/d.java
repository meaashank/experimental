package com.google.firebase.components;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements ComponentRegistrarProcessor {
    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public final List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}
