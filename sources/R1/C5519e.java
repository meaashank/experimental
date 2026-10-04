package r1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.T;

/* JADX INFO: renamed from: r1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C5519e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f227136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f227137b;

    /* JADX INFO: renamed from: r1.e$a */
    public static class a {
        public boolean a(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
            return androidx.emoji2.text.d.g(editable, i10, keyEvent);
        }
    }

    public C5519e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f227136a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f227136a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f227137b.a(editable, i10, keyEvent) || this.f227136a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f227136a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f227136a.onKeyUp(view, editable, i10, keyEvent);
    }

    public C5519e(KeyListener keyListener, a aVar) {
        this.f227136a = keyListener;
        this.f227137b = aVar;
    }
}
