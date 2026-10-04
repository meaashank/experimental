package com.github.ahmadaghazadeh.editor.processor.utils.text;

import androidx.compose.runtime.V1;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class UndoStack implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f150602c = 1048576;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150603a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<TextChange> f150604b = new ArrayList<>();

    public void d() {
        this.f150604b.clear();
    }

    public TextChange g() {
        int size = this.f150604b.size();
        if (size <= 0) {
            return null;
        }
        int i10 = size - 1;
        TextChange textChange = this.f150604b.get(i10);
        this.f150604b.remove(i10);
        this.f150603a -= textChange.f150600b.length() + textChange.f150599a.length();
        return textChange;
    }

    public void h(TextChange textChange) {
        if (textChange.f150599a == null) {
            textChange.f150599a = "";
        }
        if (textChange.f150600b == null) {
            textChange.f150600b = "";
        }
        int length = textChange.f150600b.length() + textChange.f150599a.length();
        if (length >= 1048576) {
            i();
            return;
        }
        if (this.f150604b.size() > 0) {
            boolean z10 = true;
            TextChange textChange2 = (TextChange) V1.a(this.f150604b, 1);
            if (textChange.f150600b.length() == 0 && textChange.f150599a.length() == 1 && textChange2.f150600b.length() == 0) {
                if (textChange2.f150599a.length() + textChange2.f150601c != textChange.f150601c) {
                    this.f150604b.add(textChange);
                } else if (Character.isWhitespace(textChange.f150599a.charAt(0))) {
                    for (char c10 : textChange2.f150599a.toCharArray()) {
                        if (!Character.isWhitespace(c10)) {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        textChange2.f150599a += textChange.f150599a;
                    } else {
                        this.f150604b.add(textChange);
                    }
                } else if (Character.isLetterOrDigit(textChange.f150599a.charAt(0))) {
                    for (char c11 : textChange2.f150599a.toCharArray()) {
                        if (!Character.isLetterOrDigit(c11)) {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        textChange2.f150599a += textChange.f150599a;
                    } else {
                        this.f150604b.add(textChange);
                    }
                } else {
                    this.f150604b.add(textChange);
                }
            } else if (textChange.f150600b.length() != 1 || textChange.f150599a.length() != 0 || textChange2.f150599a.length() != 0 || textChange2.f150601c - 1 != textChange.f150601c) {
                this.f150604b.add(textChange);
            } else if (Character.isWhitespace(textChange.f150600b.charAt(0))) {
                for (char c12 : textChange2.f150600b.toCharArray()) {
                    if (!Character.isWhitespace(c12)) {
                        z10 = false;
                    }
                }
                if (z10) {
                    textChange2.f150600b = textChange.f150600b + textChange2.f150600b;
                    textChange2.f150601c = textChange2.f150601c - textChange.f150600b.length();
                } else {
                    this.f150604b.add(textChange);
                }
            } else if (Character.isLetterOrDigit(textChange.f150600b.charAt(0))) {
                for (char c13 : textChange2.f150600b.toCharArray()) {
                    if (!Character.isLetterOrDigit(c13)) {
                        z10 = false;
                    }
                }
                if (z10) {
                    textChange2.f150600b = textChange.f150600b + textChange2.f150600b;
                    textChange2.f150601c = textChange2.f150601c - textChange.f150600b.length();
                } else {
                    this.f150604b.add(textChange);
                }
            } else {
                this.f150604b.add(textChange);
            }
        } else {
            this.f150604b.add(textChange);
        }
        this.f150603a += length;
        while (this.f150603a > 1048576 && j()) {
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:358)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v1 java.util.Collection<?>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public void i() {
        /*
            r1 = this;
            java.util.ArrayList<com.github.ahmadaghazadeh.editor.processor.utils.text.TextChange> r0 = r1.f150604b
            r0.removeAll(r0)
            r0 = 0
            r1.f150603a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.ahmadaghazadeh.editor.processor.utils.text.UndoStack.i():void");
    }

    public final boolean j() {
        if (this.f150604b.size() <= 0) {
            return false;
        }
        TextChange textChange = this.f150604b.get(0);
        this.f150604b.remove(0);
        this.f150603a -= textChange.f150600b.length() + textChange.f150599a.length();
        return true;
    }
}
