package y3;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.f;
import java.util.Arrays;
import v3.AbstractC5680f;
import w3.InterfaceC5744e;

/* JADX INFO: loaded from: classes2.dex */
public class p<T> implements f.b<T>, v3.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f241088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f241089b;

    public p() {
    }

    @Override // com.bumptech.glide.f.b
    @Nullable
    public int[] a(@NonNull T t10, int i10, int i11) {
        int[] iArr = this.f241088a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(@NonNull View view) {
        if (this.f241088a == null && this.f241089b == null) {
            a aVar = new a(view);
            this.f241089b = aVar;
            aVar.h(this);
        }
    }

    @Override // v3.o
    public void d(int i10, int i11) {
        this.f241088a = new int[]{i10, i11};
        this.f241089b = null;
    }

    public p(@NonNull View view) {
        a aVar = new a(view);
        this.f241089b = aVar;
        aVar.h(this);
    }

    public static final class a extends AbstractC5680f<View, Object> {
        public a(@NonNull View view) {
            super(view);
        }

        @Override // v3.AbstractC5680f
        public void j(@Nullable Drawable drawable) {
        }

        @Override // v3.p
        public void n(@Nullable Drawable drawable) {
        }

        @Override // v3.p
        public void g(@NonNull Object obj, @Nullable InterfaceC5744e<? super Object> interfaceC5744e) {
        }
    }
}
