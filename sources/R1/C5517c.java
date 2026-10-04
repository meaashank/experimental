package r1;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.D;
import e.T;

/* JADX INFO: renamed from: r1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C5517c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f227130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f227131b;

    /* JADX INFO: renamed from: r1.c$a */
    public static class a {
        public boolean a(@NonNull InputConnection inputConnection, @NonNull Editable editable, @D(from = 0) int i10, @D(from = 0) int i11, boolean z10) {
            return androidx.emoji2.text.d.f(inputConnection, editable, i10, i11, z10);
        }

        public void b(@NonNull EditorInfo editorInfo) {
            if (androidx.emoji2.text.c.q()) {
                androidx.emoji2.text.c.c().G(editorInfo);
            }
        }
    }

    public C5517c(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    public final Editable b() {
        return this.f227130a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f227131b.a(this, this.f227130a.getEditableText(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f227131b.a(this, this.f227130a.getEditableText(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    public C5517c(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull a aVar) {
        super(inputConnection, false);
        this.f227130a = textView;
        this.f227131b = aVar;
        aVar.b(editorInfo);
    }
}
