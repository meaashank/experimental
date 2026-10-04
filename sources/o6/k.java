package o6;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f223344a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedList<a> f223345b = new LinkedList<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f223346a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f223347b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f223348c = 100.0d;
    }

    public int a() {
        return (int) b();
    }

    public double b() {
        Iterator<a> it = this.f223345b.iterator();
        double d10 = 0.0d;
        while (it.hasNext()) {
            d10 += (it.next().f223348c * r3.f223346a) / r3.f223347b;
        }
        return ((this.f223344a.f223348c * r0.f223346a) / r0.f223347b) + d10;
    }

    public void c(long j10) {
        this.f223344a.f223346a += j10;
    }

    public void d(long j10) {
        a aVar = this.f223344a;
        if (aVar.f223347b == 0) {
            aVar.f223347b = j10;
            return;
        }
        this.f223345b.add(aVar);
        a aVar2 = new a();
        aVar2.f223348c = this.f223344a.f223348c / r1.f223347b;
        aVar2.f223347b = j10;
        this.f223344a = aVar2;
    }

    public abstract void e();

    public void f() {
        if (this.f223345b.isEmpty()) {
            return;
        }
        this.f223344a = this.f223345b.removeLast();
    }
}
