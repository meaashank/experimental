package w3;

import com.bumptech.glide.load.DataSource;
import w3.InterfaceC5744e;

/* JADX INFO: renamed from: w3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5743d<R> implements InterfaceC5744e<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5743d<?> f240082a = new C5743d<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC5745f<?> f240083b = new a();

    /* JADX INFO: renamed from: w3.d$a */
    public static class a<R> implements InterfaceC5745f<R> {
        @Override // w3.InterfaceC5745f
        public InterfaceC5744e<R> a(DataSource dataSource, boolean z10) {
            return C5743d.f240082a;
        }
    }

    public static <R> InterfaceC5744e<R> b() {
        return f240082a;
    }

    public static <R> InterfaceC5745f<R> c() {
        return (InterfaceC5745f<R>) f240083b;
    }

    @Override // w3.InterfaceC5744e
    public boolean a(Object obj, InterfaceC5744e.a aVar) {
        return false;
    }
}
