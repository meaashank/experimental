package v5;

import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: renamed from: v5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5687c implements MultiAutoCompleteTextView.Tokenizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239855a = "!@#$%^&*()_+-={}|[]:;'<>/<.? \r\n\t";

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public int findTokenEnd(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (f239855a.contains(Character.toString(charSequence.charAt(i10 - 1)))) {
                return i10;
            }
            i10++;
        }
        return length;
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public int findTokenStart(CharSequence charSequence, int i10) {
        int i11 = i10;
        while (i11 > 0 && !f239855a.contains(Character.toString(charSequence.charAt(i11 - 1)))) {
            i11--;
        }
        while (i11 < i10 && charSequence.charAt(i11) == ' ') {
            i11++;
        }
        return i11;
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public CharSequence terminateToken(CharSequence charSequence) {
        for (int length = charSequence.length(); length > 0 && charSequence.charAt(length - 1) == ' '; length--) {
        }
        return charSequence;
    }
}
