package q5;

import android.view.MotionEvent;
import android.view.View;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;

/* JADX INFO: renamed from: q5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnTouchListenerC5434b implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TextProcessor.d(view, motionEvent);
        return false;
    }
}
