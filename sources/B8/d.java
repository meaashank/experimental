package B8;

import androidx.datastore.preferences.protobuf.C2538n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f17410c = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f17411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17412b;

    public d() {
    }

    public static d i(int... iArr) {
        d dVar = new d();
        dVar.f17411a = Arrays.copyOf(iArr, iArr.length);
        dVar.f17412b = iArr.length;
        return dVar;
    }

    public void a(int i10) {
        this.f17412b++;
        e();
        this.f17411a[this.f17412b - 1] = i10;
    }

    public void b(int[] iArr) {
        int i10 = this.f17412b;
        this.f17412b = iArr.length + i10;
        e();
        System.arraycopy(iArr, 0, this.f17411a, i10, iArr.length);
    }

    public void c() {
        this.f17412b = 0;
    }

    public boolean d(int i10) {
        for (int i11 = 0; i11 < this.f17412b; i11++) {
            if (this.f17411a[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        int i10 = this.f17412b;
        int[] iArr = this.f17411a;
        if (i10 <= iArr.length) {
            return;
        }
        int length = iArr.length;
        while (this.f17412b > length) {
            length = C2538n.a(length, 3, 2, 1);
        }
        this.f17411a = Arrays.copyOf(this.f17411a, length);
    }

    public int f(int i10) {
        return this.f17411a[i10];
    }

    public int[] g() {
        int i10 = this.f17412b;
        return i10 > 0 ? Arrays.copyOf(this.f17411a, i10) : f17410c;
    }

    public int[] h(int i10, int i11) {
        return Arrays.copyOfRange(this.f17411a, i10, i11);
    }

    public void j() {
        int i10 = this.f17412b;
        int[] iArr = this.f17411a;
        if (i10 > iArr.length) {
            this.f17411a = Arrays.copyOf(iArr, i10);
        }
    }

    public void k(int i10) {
        l(i10, 1);
    }

    public void l(int i10, int i11) {
        int[] iArr = this.f17411a;
        System.arraycopy(iArr, i10 + i11, iArr, i10, (this.f17412b - i10) - i11);
        this.f17412b -= i11;
    }

    public void m(int i10, int i11) {
        if (i10 < this.f17412b) {
            this.f17411a[i10] = i11;
        } else {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " is greater than the list size ");
            sbA.append(this.f17412b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
    }

    public int n() {
        return this.f17412b;
    }

    public d(int i10) {
        this.f17411a = new int[i10];
    }
}
