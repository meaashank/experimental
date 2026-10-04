package w3;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;
import w3.C5749j;

/* JADX INFO: renamed from: w3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5746g<R> implements InterfaceC5745f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5749j.a f240084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC5744e<R> f240085b;

    /* JADX INFO: renamed from: w3.g$a */
    public static class a implements C5749j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f240086a;

        public a(Animation animation) {
            this.f240086a = animation;
        }

        @Override // w3.C5749j.a
        public Animation a(Context context) {
            return this.f240086a;
        }
    }

    /* JADX INFO: renamed from: w3.g$b */
    public static class b implements C5749j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f240087a;

        public b(int i10) {
            this.f240087a = i10;
        }

        @Override // w3.C5749j.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f240087a);
        }
    }

    public C5746g(Animation animation) {
        this(new a(animation));
    }

    @Override // w3.InterfaceC5745f
    public InterfaceC5744e<R> a(DataSource dataSource, boolean z10) {
        if (dataSource == DataSource.MEMORY_CACHE || !z10) {
            return C5743d.f240082a;
        }
        if (this.f240085b == null) {
            this.f240085b = new C5749j(this.f240084a);
        }
        return this.f240085b;
    }

    public C5746g(int i10) {
        this(new b(i10));
    }

    public C5746g(C5749j.a aVar) {
        this.f240084a = aVar;
    }
}
