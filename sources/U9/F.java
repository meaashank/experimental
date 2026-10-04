package U9;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f73911c;

    public F(String str, int i10) {
        this.f73909a = str;
        this.f73910b = i10 < 0 ? 0 : i10;
    }

    public String a() {
        return this.f73909a;
    }

    public int b() {
        return this.f73910b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return this.f73910b == f10.f73910b && Objects.equals(this.f73909a, f10.f73909a);
    }

    public int hashCode() {
        if (this.f73911c == null) {
            this.f73911c = Integer.valueOf(Objects.hash(this.f73909a, Integer.valueOf(this.f73910b)));
        }
        return this.f73911c.intValue();
    }
}
