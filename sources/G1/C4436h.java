package g1;

import androidx.annotation.RestrictTo;
import androidx.cardview.widget.CardView;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: renamed from: g1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @androidx.databinding.g(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @androidx.databinding.g(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @androidx.databinding.g(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C4436h {
    @InterfaceC2511d({"contentPadding"})
    public static void a(CardView cardView, int i10) {
        cardView.setContentPadding(i10, i10, i10, i10);
    }

    @InterfaceC2511d({"contentPaddingBottom"})
    public static void b(CardView cardView, int i10) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i10);
    }

    @InterfaceC2511d({"contentPaddingLeft"})
    public static void c(CardView cardView, int i10) {
        cardView.setContentPadding(i10, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    @InterfaceC2511d({"contentPaddingRight"})
    public static void d(CardView cardView, int i10) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i10, cardView.getContentPaddingBottom());
    }

    @InterfaceC2511d({"contentPaddingTop"})
    public static void e(CardView cardView, int i10) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), i10, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }
}
