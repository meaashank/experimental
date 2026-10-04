package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.w;

/* JADX INFO: loaded from: classes2.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f115442Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public a f115443a0;

    public interface a {
        void a(@NonNull EditText editText);
    }

    public static final class b implements Preference.f<EditTextPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f115444a;

        @NonNull
        public static b b() {
            if (f115444a == null) {
                f115444a = new b();
            }
            return f115444a;
        }

        @Override // androidx.preference.Preference.f
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(@NonNull EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.F1()) ? editTextPreference.i().getString(w.i.f115836c) : editTextPreference.F1();
        }
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.k.f116004x, i10, i11);
        int i12 = w.k.f116007y;
        if (D0.n.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            b1(b.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Nullable
    public a E1() {
        return this.f115443a0;
    }

    @Nullable
    public String F1() {
        return this.f115442Z;
    }

    public void G1(@Nullable a aVar) {
        this.f115443a0 = aVar;
    }

    public void H1(@Nullable String str) {
        boolean zH1 = h1();
        this.f115442Z = str;
        w0(str);
        boolean zH12 = h1();
        if (zH12 != zH1) {
            Y(zH12);
        }
        X();
    }

    @Override // androidx.preference.Preference
    public Object h0(@NonNull TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    @Override // androidx.preference.Preference
    public boolean h1() {
        return TextUtils.isEmpty(this.f115442Z) || super.h1();
    }

    @Override // androidx.preference.Preference
    public void l0(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.l0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.l0(savedState.getSuperState());
        H1(savedState.mText);
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Parcelable m0() {
        super.m0();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (R()) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.mText = F1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void n0(Object obj) {
        H1(C((String) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String mText;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mText = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.mText);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, D0.n.a(context, w.a.f115782o, R.attr.editTextPreferenceStyle), 0);
    }

    public EditTextPreference(@NonNull Context context) {
        this(context, null);
    }
}
