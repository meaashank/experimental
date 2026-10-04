package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.s;
import g3.InterfaceC4444b;

/* JADX INFO: loaded from: classes2.dex */
public class i extends y3.j<InterfaceC4444b, s<?>> implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j.a f139612e;

    public i(long j10) {
        super(j10);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(e() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @Nullable
    public /* bridge */ /* synthetic */ s f(@NonNull InterfaceC4444b interfaceC4444b, @Nullable s sVar) {
        return (s) super.o(interfaceC4444b, sVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @Nullable
    public /* bridge */ /* synthetic */ s g(@NonNull InterfaceC4444b interfaceC4444b) {
        return (s) super.p(interfaceC4444b);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void h(@NonNull j.a aVar) {
        this.f139612e = aVar;
    }

    @Override // y3.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int m(@Nullable s<?> sVar) {
        if (sVar == null) {
            return 1;
        }
        return sVar.getSize();
    }

    @Override // y3.j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(@NonNull InterfaceC4444b interfaceC4444b, @Nullable s<?> sVar) {
        j.a aVar = this.f139612e;
        if (aVar == null || sVar == null) {
            return;
        }
        aVar.d(sVar);
    }
}
