package com.prism.hider.vault.commons;

import com.prism.hider.vault.commons.NoneVaultModule;

/* JADX INFO: renamed from: com.prism.hider.vault.commons.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4274j implements dagger.internal.e<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4274j f168653a = new C4274j();

    public static C4274j a() {
        return f168653a;
    }

    public static E c() {
        return new NoneVaultModule.a();
    }

    public static E d() {
        return new NoneVaultModule.a();
    }

    public E b() {
        return new NoneVaultModule.a();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new NoneVaultModule.a();
    }
}
