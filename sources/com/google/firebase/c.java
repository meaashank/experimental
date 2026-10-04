package com.google.firebase;

import android.content.Context;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements LibraryVersionComponent.VersionExtractor {
    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.c((Context) obj);
    }
}
