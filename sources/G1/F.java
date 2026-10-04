package g1;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;
import i1.C4543a;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:autoLink", method = "setAutoLinkMask", type = TextView.class), @androidx.databinding.g(attribute = "android:drawablePadding", method = "setCompoundDrawablePadding", type = TextView.class), @androidx.databinding.g(attribute = "android:editorExtras", method = "setInputExtras", type = TextView.class), @androidx.databinding.g(attribute = "android:inputType", method = "setRawInputType", type = TextView.class), @androidx.databinding.g(attribute = "android:scrollHorizontally", method = "setHorizontallyScrolling", type = TextView.class), @androidx.databinding.g(attribute = "android:textAllCaps", method = "setAllCaps", type = TextView.class), @androidx.databinding.g(attribute = "android:textColorHighlight", method = "setHighlightColor", type = TextView.class), @androidx.databinding.g(attribute = "android:textColorHint", method = "setHintTextColor", type = TextView.class), @androidx.databinding.g(attribute = "android:textColorLink", method = "setLinkTextColor", type = TextView.class), @androidx.databinding.g(attribute = "android:onEditorAction", method = "setOnEditorActionListener", type = TextView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f202172a = "TextViewBindingAdapters";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f202173b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f202174c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f202175d = 5;

    public class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f202176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f202177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.n f202178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f202179d;

        public a(c cVar, d dVar, androidx.databinding.n nVar, b bVar) {
            this.f202176a = cVar;
            this.f202177b = dVar;
            this.f202178c = nVar;
            this.f202179d = bVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            b bVar = this.f202179d;
            if (bVar != null) {
                bVar.afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = this.f202176a;
            if (cVar != null) {
                cVar.beforeTextChanged(charSequence, i10, i11, i12);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            d dVar = this.f202177b;
            if (dVar != null) {
                dVar.onTextChanged(charSequence, i10, i11, i12);
            }
            androidx.databinding.n nVar = this.f202178c;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    public interface b {
        void afterTextChanged(Editable editable);
    }

    public interface c {
        void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12);
    }

    public interface d {
        void onTextChanged(CharSequence charSequence, int i10, int i11, int i12);
    }

    @InterfaceC2511d({"android:text"})
    public static void A(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    @InterfaceC2511d({"android:textSize"})
    public static void B(TextView textView, float f10) {
        textView.setTextSize(0, f10);
    }

    @InterfaceC2511d(requireAll = false, value = {"android:beforeTextChanged", "android:onTextChanged", "android:afterTextChanged", "android:textAttrChanged"})
    public static void C(TextView textView, c cVar, d dVar, b bVar, androidx.databinding.n nVar) {
        a aVar = (cVar == null && bVar == null && dVar == null && nVar == null) ? null : new a(cVar, dVar, nVar, bVar);
        TextWatcher textWatcher = (TextWatcher) r.b(textView, aVar, C4543a.C0748a.f202777c);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }

    @androidx.databinding.m(attribute = "android:text", event = "android:textAttrChanged")
    public static String a(TextView textView) {
        return textView.getText().toString();
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC2511d({"android:autoText"})
    public static void c(TextView textView, boolean z10) {
        KeyListener keyListener = textView.getKeyListener();
        TextKeyListener.Capitalize capitalize = TextKeyListener.Capitalize.NONE;
        int inputType = keyListener != null ? keyListener.getInputType() : 0;
        if ((inputType & 4096) != 0) {
            capitalize = TextKeyListener.Capitalize.CHARACTERS;
        } else if ((inputType & 8192) != 0) {
            capitalize = TextKeyListener.Capitalize.WORDS;
        } else if ((inputType & 16384) != 0) {
            capitalize = TextKeyListener.Capitalize.SENTENCES;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z10, capitalize));
    }

    @InterfaceC2511d({"android:bufferType"})
    public static void d(TextView textView, TextView.BufferType bufferType) {
        textView.setText(textView.getText(), bufferType);
    }

    @InterfaceC2511d({"android:capitalize"})
    public static void e(TextView textView, TextKeyListener.Capitalize capitalize) {
        textView.setKeyListener(TextKeyListener.getInstance((textView.getKeyListener().getInputType() & 32768) != 0, capitalize));
    }

    @InterfaceC2511d({"android:digits"})
    public static void f(TextView textView, CharSequence charSequence) {
        if (charSequence != null) {
            textView.setKeyListener(DigitsKeyListener.getInstance(charSequence.toString()));
        } else if (textView.getKeyListener() instanceof DigitsKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @InterfaceC2511d({"android:drawableBottom"})
    public static void g(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    @InterfaceC2511d({"android:drawableEnd"})
    public static void h(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    @InterfaceC2511d({"android:drawableLeft"})
    public static void i(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    @InterfaceC2511d({"android:drawableRight"})
    public static void j(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    @InterfaceC2511d({"android:drawableStart"})
    public static void k(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @InterfaceC2511d({"android:drawableTop"})
    public static void l(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    @InterfaceC2511d({"android:imeActionId"})
    public static void m(TextView textView, int i10) {
        textView.setImeActionLabel(textView.getImeActionLabel(), i10);
    }

    @InterfaceC2511d({"android:imeActionLabel"})
    public static void n(TextView textView, CharSequence charSequence) {
        textView.setImeActionLabel(charSequence, textView.getImeActionId());
    }

    @InterfaceC2511d({"android:inputMethod"})
    public static void o(TextView textView, CharSequence charSequence) {
        try {
            textView.setKeyListener((KeyListener) Class.forName(charSequence.toString()).newInstance());
        } catch (ClassNotFoundException e10) {
            Log.e(f202172a, "Could not create input method: " + ((Object) charSequence), e10);
        } catch (IllegalAccessException e11) {
            Log.e(f202172a, "Could not create input method: " + ((Object) charSequence), e11);
        } catch (InstantiationException e12) {
            Log.e(f202172a, "Could not create input method: " + ((Object) charSequence), e12);
        }
    }

    public static void p(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @InterfaceC2511d({"android:lineSpacingExtra"})
    public static void q(TextView textView, float f10) {
        textView.setLineSpacing(f10, textView.getLineSpacingMultiplier());
    }

    @InterfaceC2511d({"android:lineSpacingMultiplier"})
    public static void r(TextView textView, float f10) {
        textView.setLineSpacing(textView.getLineSpacingExtra(), f10);
    }

    @InterfaceC2511d({"android:maxLength"})
    public static void s(TextView textView, int i10) {
        InputFilter[] filters = textView.getFilters();
        if (filters != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= filters.length) {
                    int length = filters.length;
                    InputFilter[] inputFilterArr = new InputFilter[length + 1];
                    System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                    inputFilterArr[length] = new InputFilter.LengthFilter(i10);
                    filters = inputFilterArr;
                    break;
                }
                InputFilter inputFilter = filters[i11];
                if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                    i11++;
                } else if (((InputFilter.LengthFilter) inputFilter).getMax() != i10) {
                    filters[i11] = new InputFilter.LengthFilter(i10);
                }
            }
        } else {
            filters = new InputFilter[]{new InputFilter.LengthFilter(i10)};
        }
        textView.setFilters(filters);
    }

    @InterfaceC2511d({"android:numeric"})
    public static void t(TextView textView, int i10) {
        textView.setKeyListener(DigitsKeyListener.getInstance((i10 & 3) != 0, (i10 & 5) != 0));
    }

    @InterfaceC2511d({"android:password"})
    public static void u(TextView textView, boolean z10) {
        if (z10) {
            textView.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textView.setTransformationMethod(null);
        }
    }

    @InterfaceC2511d({"android:phoneNumber"})
    public static void v(TextView textView, boolean z10) {
        if (z10) {
            textView.setKeyListener(DialerKeyListener.getInstance());
        } else if (textView.getKeyListener() instanceof DialerKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @InterfaceC2511d({"android:shadowColor"})
    public static void w(TextView textView, int i10) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i10);
    }

    @InterfaceC2511d({"android:shadowDx"})
    public static void x(TextView textView, float f10) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), f10, textView.getShadowDy(), shadowColor);
    }

    @InterfaceC2511d({"android:shadowDy"})
    public static void y(TextView textView, float f10) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), f10, shadowColor);
    }

    @InterfaceC2511d({"android:shadowRadius"})
    public static void z(TextView textView, float f10) {
        textView.setShadowLayer(f10, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
    }
}
