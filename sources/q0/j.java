package Q0;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.t;
import e.InterfaceC4331e;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f65729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f65730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f65731f;

    public j(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        str.getClass();
        this.f65726a = str;
        str2.getClass();
        this.f65727b = str2;
        str3.getClass();
        this.f65728c = str3;
        list.getClass();
        this.f65729d = list;
        this.f65730e = 0;
        this.f65731f = a(str, str2, str3);
    }

    public final String a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return str + com.prism.gaia.download.a.f164606q + str2 + com.prism.gaia.download.a.f164606q + str3;
    }

    @Nullable
    public List<List<byte[]>> b() {
        return this.f65729d;
    }

    @InterfaceC4331e
    public int c() {
        return this.f65730e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String d() {
        return this.f65731f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String e() {
        return this.f65731f;
    }

    @NonNull
    public String f() {
        return this.f65726a;
    }

    @NonNull
    public String g() {
        return this.f65727b;
    }

    @NonNull
    public String h() {
        return this.f65728c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f65726a + ", mProviderPackage: " + this.f65727b + ", mQuery: " + this.f65728c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f65729d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f65729d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f65730e);
        return sb2.toString();
    }

    public j(@NonNull String str, @NonNull String str2, @NonNull String str3, @InterfaceC4331e int i10) {
        str.getClass();
        this.f65726a = str;
        str2.getClass();
        this.f65727b = str2;
        str3.getClass();
        this.f65728c = str3;
        this.f65729d = null;
        t.a(i10 != 0);
        this.f65730e = i10;
        this.f65731f = a(str, str2, str3);
    }
}
