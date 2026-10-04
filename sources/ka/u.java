package ka;

import android.accounts.Account;

/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f217417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f217418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f217419c = -1;

    public u(Account account, int i10) {
        this.f217417a = account;
        this.f217418b = i10;
    }

    public String a() {
        return this.f217418b + "\u0000" + this.f217417a.type + "\u0000" + this.f217417a.name;
    }

    public String b() {
        return this.f217417a.name;
    }

    public String c() {
        return this.f217417a.type;
    }
}
