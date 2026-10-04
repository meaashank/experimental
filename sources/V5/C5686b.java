package v5;

import android.widget.TextView;

/* JADX INFO: renamed from: v5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5686b {
    public int a(TextView textView) {
        int lineHeight = textView.getLineHeight();
        if (lineHeight == 0) {
            return 0;
        }
        int iAbs = Math.abs((textView.getHeight() + textView.getScrollY()) / lineHeight) + 1;
        if (iAbs < 0) {
            return 0;
        }
        return iAbs >= textView.getLineCount() ? textView.getLineCount() - 1 : iAbs;
    }

    public int b(TextView textView) {
        int scrollY;
        int lineHeight = textView.getLineHeight();
        if (lineHeight != 0 && (scrollY = textView.getScrollY() / lineHeight) >= 0) {
            return scrollY >= textView.getLineCount() ? textView.getLineCount() - 1 : scrollY;
        }
        return 0;
    }
}
