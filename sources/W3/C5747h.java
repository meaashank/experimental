package w3;

import com.bumptech.glide.load.DataSource;
import w3.C5748i;

/* JADX INFO: renamed from: w3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5747h<R> implements InterfaceC5745f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5748i.a f240088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5748i<R> f240089b;

    public C5747h(C5748i.a aVar) {
        this.f240088a = aVar;
    }

    @Override // w3.InterfaceC5745f
    public InterfaceC5744e<R> a(DataSource dataSource, boolean z10) {
        if (dataSource == DataSource.MEMORY_CACHE || !z10) {
            return C5743d.f240082a;
        }
        if (this.f240089b == null) {
            this.f240089b = new C5748i<>(this.f240088a);
        }
        return this.f240089b;
    }
}
