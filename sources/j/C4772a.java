package j;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4345t;
import e.T;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: j.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C4772a {

    /* JADX INFO: renamed from: j.a$a, reason: collision with other inner class name */
    @T(15)
    public static class C0803a {
        @InterfaceC4345t
        public static void a(@NonNull Resources resources, int i10, int i11, @NonNull TypedValue typedValue, boolean z10) {
            resources.getValueForDensity(i10, i11, typedValue, z10);
        }
    }

    /* JADX INFO: renamed from: j.a$b */
    @T(18)
    public static class b {
        @InterfaceC4345t
        public static void a(@NonNull ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    /* JADX INFO: renamed from: j.a$c */
    @T(21)
    public static class c {
        @NonNull
        @InterfaceC4345t
        public static Drawable a(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @InterfaceC4345t
        public static int b(@NonNull TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @InterfaceC4345t
        public static void c(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }
}
