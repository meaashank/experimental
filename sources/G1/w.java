package g1;

import android.widget.RatingBar;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.p({@androidx.databinding.o(attribute = "android:rating", type = RatingBar.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class w {

    public class a implements RatingBar.OnRatingBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RatingBar.OnRatingBarChangeListener f202221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.n f202222b;

        public a(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, androidx.databinding.n nVar) {
            this.f202221a = onRatingBarChangeListener;
            this.f202222b = nVar;
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f10, boolean z10) {
            RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.f202221a;
            if (onRatingBarChangeListener != null) {
                onRatingBarChangeListener.onRatingChanged(ratingBar, f10, z10);
            }
            this.f202222b.a();
        }
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void a(RatingBar ratingBar, RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, androidx.databinding.n nVar) {
        if (nVar == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new a(onRatingBarChangeListener, nVar));
        }
    }

    @InterfaceC2511d({"android:rating"})
    public static void b(RatingBar ratingBar, float f10) {
        if (ratingBar.getRating() != f10) {
            ratingBar.setRating(f10);
        }
    }
}
