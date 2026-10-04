package m1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
public class d extends AbstractC5195a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f221083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f221084d;

    public d(@Nullable AbstractC5195a abstractC5195a, Context context, Uri uri) {
        super(abstractC5195a);
        this.f221083c = context;
        this.f221084d = uri;
    }

    @Override // m1.AbstractC5195a
    public boolean a() {
        return b.a(this.f221083c, this.f221084d);
    }

    @Override // m1.AbstractC5195a
    public boolean b() {
        return b.b(this.f221083c, this.f221084d);
    }

    @Override // m1.AbstractC5195a
    public AbstractC5195a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // m1.AbstractC5195a
    public AbstractC5195a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // m1.AbstractC5195a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f221083c.getContentResolver(), this.f221084d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // m1.AbstractC5195a
    public boolean f() {
        return b.d(this.f221083c, this.f221084d);
    }

    @Override // m1.AbstractC5195a
    @Nullable
    public String k() {
        return b.f(this.f221083c, this.f221084d);
    }

    @Override // m1.AbstractC5195a
    @Nullable
    public String m() {
        return b.h(this.f221083c, this.f221084d);
    }

    @Override // m1.AbstractC5195a
    public Uri n() {
        return this.f221084d;
    }

    @Override // m1.AbstractC5195a
    public boolean o() {
        return b.i(this.f221083c, this.f221084d);
    }

    @Override // m1.AbstractC5195a
    public boolean q() {
        return b.j(this.f221083c, this.f221084d);
    }

    @Override // m1.AbstractC5195a
    public boolean r() {
        return b.k(this.f221083c, this.f221084d);
    }

    @Override // m1.AbstractC5195a
    public long s() {
        return b.l(this.f221083c, this.f221084d);
    }

    @Override // m1.AbstractC5195a
    public long t() {
        return b.m(this.f221083c, this.f221084d);
    }

    @Override // m1.AbstractC5195a
    public AbstractC5195a[] u() {
        throw new UnsupportedOperationException();
    }

    @Override // m1.AbstractC5195a
    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}
