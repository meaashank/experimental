package com.prism.gaia.server.accounts;

import android.accounts.Account;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Account f166405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166406b;

    public a(Account account, int i10) {
        this.f166405a = account;
        this.f166406b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f166405a.equals(aVar.f166405a) && this.f166406b == aVar.f166406b;
    }

    public int hashCode() {
        return this.f166405a.hashCode() + this.f166406b;
    }

    public String toString() {
        return this.f166405a.toString() + " u" + this.f166406b;
    }
}
