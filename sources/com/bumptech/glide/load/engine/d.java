package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.cache.a;
import g3.C4447e;
import g3.InterfaceC4443a;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class d<DataType> implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4443a<DataType> f139619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataType f139620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4447e f139621c;

    public d(InterfaceC4443a<DataType> interfaceC4443a, DataType datatype, C4447e c4447e) {
        this.f139619a = interfaceC4443a;
        this.f139620b = datatype;
        this.f139621c = c4447e;
    }

    @Override // com.bumptech.glide.load.engine.cache.a.b
    public boolean a(@NonNull File file) {
        return this.f139619a.b(this.f139620b, file, this.f139621c);
    }
}
