package j5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class j extends e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final View f214179C;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f214180a;

        public a(Runnable runnable) {
            this.f214180a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            j.this.f214179C.getLocationOnScreen(iArr);
            j jVar = j.this;
            int i10 = iArr[0];
            jVar.f214062e = new Rect(i10, iArr[1], j.this.f214179C.getWidth() + i10, j.this.f214179C.getHeight() + iArr[1]);
            j jVar2 = j.this;
            if (jVar2.f214063f == null && jVar2.f214179C.getWidth() > 0 && j.this.f214179C.getHeight() > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(j.this.f214179C.getWidth(), j.this.f214179C.getHeight(), Bitmap.Config.ARGB_8888);
                j.this.f214179C.draw(new Canvas(bitmapCreateBitmap));
                j.this.f214063f = new BitmapDrawable(j.this.f214179C.getContext().getResources(), bitmapCreateBitmap);
                Drawable drawable = j.this.f214063f;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), j.this.f214063f.getIntrinsicHeight());
            }
            this.f214180a.run();
        }
    }

    public j(View view, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        super(charSequence, charSequence2);
        if (view == null) {
            throw new IllegalArgumentException("Given null view to target");
        }
        this.f214179C = view;
    }

    @Override // j5.e
    public void K(Runnable runnable) {
        k.b(this.f214179C, new a(runnable));
    }
}
