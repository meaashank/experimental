package Ha;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.prism.commons.utils.l0;

/* JADX INFO: loaded from: classes7.dex */
public class b implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f50677b = l0.b(b.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f50678a;

    public b(d dVar) {
        a(dVar);
    }

    public void a(d dVar) {
        this.f50678a = dVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        float fC;
        float x10;
        float y10;
        d dVar = this.f50678a;
        if (dVar == null) {
            return false;
        }
        try {
            fC = dVar.c();
            x10 = motionEvent.getX();
            y10 = motionEvent.getY();
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (fC < this.f50678a.F()) {
            d dVar2 = this.f50678a;
            dVar2.b(dVar2.F(), x10, y10, true);
            return true;
        }
        if (fC < this.f50678a.F() || fC >= this.f50678a.g()) {
            d dVar3 = this.f50678a;
            dVar3.b(dVar3.G(), x10, y10, true);
            return true;
        }
        d dVar4 = this.f50678a;
        dVar4.b(dVar4.g(), x10, y10, true);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF rectFI;
        d dVar = this.f50678a;
        if (dVar != null) {
            ImageView imageViewW = dVar.W();
            if (this.f50678a.Z() != null && (rectFI = this.f50678a.i()) != null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (rectFI.contains(x10, y10)) {
                    this.f50678a.Z().a(imageViewW, (x10 - rectFI.left) / rectFI.width(), (y10 - rectFI.top) / rectFI.height());
                    return true;
                }
                this.f50678a.Z().b();
            }
            if (this.f50678a.a0() != null) {
                this.f50678a.a0().a(imageViewW, motionEvent.getX(), motionEvent.getY());
            }
        }
        return false;
    }
}
