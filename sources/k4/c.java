package K4;

import L4.e;
import com.flask.colorpicker.ColorPickerView;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58414a;

        static {
            int[] iArr = new int[ColorPickerView.WHEEL_TYPE.values().length];
            f58414a = iArr;
            try {
                iArr[ColorPickerView.WHEEL_TYPE.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58414a[ColorPickerView.WHEEL_TYPE.FLOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static L4.c a(ColorPickerView.WHEEL_TYPE wheel_type) {
        int i10 = a.f58414a[wheel_type.ordinal()];
        if (i10 == 1) {
            return new e();
        }
        if (i10 == 2) {
            return new L4.d();
        }
        throw new IllegalArgumentException("wrong WHEEL_TYPE");
    }
}
