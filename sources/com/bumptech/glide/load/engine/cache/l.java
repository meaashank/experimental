package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.core.util.s;
import g3.InterfaceC4444b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import y3.m;
import y3.o;
import z3.AbstractC5855c;
import z3.C5853a;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3.j<InterfaceC4444b, String> f139614a = new y3.j<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.a<b> f139615b = C5853a.e(10, new a());

    public class a implements C5853a.d<b> {
        public a() {
        }

        @Override // z3.C5853a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class b implements C5853a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageDigest f139617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC5855c f139618b = new AbstractC5855c.C0914c();

        public b(MessageDigest messageDigest) {
            this.f139617a = messageDigest;
        }

        @Override // z3.C5853a.f
        @NonNull
        public AbstractC5855c e() {
            return this.f139618b;
        }
    }

    public final String a(InterfaceC4444b interfaceC4444b) {
        b bVarA = this.f139615b.a();
        m.f(bVarA, "Argument must not be null");
        b bVar = bVarA;
        try {
            interfaceC4444b.b(bVar.f139617a);
            return o.A(bVar.f139617a.digest());
        } finally {
            this.f139615b.b(bVar);
        }
    }

    public String b(InterfaceC4444b interfaceC4444b) {
        String strK;
        synchronized (this.f139614a) {
            strK = this.f139614a.k(interfaceC4444b);
        }
        if (strK == null) {
            strK = a(interfaceC4444b);
        }
        synchronized (this.f139614a) {
            this.f139614a.o(interfaceC4444b, strK);
        }
        return strK;
    }
}
