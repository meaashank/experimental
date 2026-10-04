package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.w;
import e.InterfaceC4331e;

/* JADX INFO: loaded from: classes2.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f115445e0 = "ListPreference";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public CharSequence[] f115446Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CharSequence[] f115447a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f115448b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f115449c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f115450d0;

    public static final class a implements Preference.f<ListPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f115451a;

        @NonNull
        public static a b() {
            if (f115451a == null) {
                f115451a = new a();
            }
            return f115451a;
        }

        @Override // androidx.preference.Preference.f
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(@NonNull ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.G1()) ? listPreference.i().getString(w.i.f115836c) : listPreference.G1();
        }
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.k.f116010z, i10, i11);
        this.f115446Z = D0.n.q(typedArrayObtainStyledAttributes, w.k.f115879C, w.k.f115873A);
        int i12 = w.k.f115882D;
        int i13 = w.k.f115876B;
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(i12);
        this.f115447a0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(i13) : textArray;
        int i14 = w.k.f115885E;
        if (typedArrayObtainStyledAttributes.getBoolean(i14, typedArrayObtainStyledAttributes.getBoolean(i14, false))) {
            b1(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, w.k.f115903K, i10, i11);
        this.f115449c0 = D0.n.o(typedArrayObtainStyledAttributes2, w.k.f115990s0, w.k.f115919S);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public int E1(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f115447a0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f115447a0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] F1() {
        return this.f115446Z;
    }

    @Nullable
    public CharSequence G1() {
        CharSequence[] charSequenceArr;
        int iE1 = E1(this.f115448b0);
        if (iE1 < 0 || (charSequenceArr = this.f115446Z) == null) {
            return null;
        }
        return charSequenceArr[iE1];
    }

    public CharSequence[] H1() {
        return this.f115447a0;
    }

    @Override // androidx.preference.Preference
    @Nullable
    public CharSequence I() {
        Preference.f fVar = this.f115472P;
        if (fVar != null) {
            return fVar.a(this);
        }
        CharSequence charSequenceG1 = G1();
        CharSequence charSequenceI = super.I();
        String str = this.f115449c0;
        if (str != null) {
            if (charSequenceG1 == null) {
                charSequenceG1 = "";
            }
            String str2 = String.format(str, charSequenceG1);
            if (!TextUtils.equals(str2, charSequenceI)) {
                Log.w(f115445e0, "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceI;
    }

    public String I1() {
        return this.f115448b0;
    }

    public final int J1() {
        return E1(this.f115448b0);
    }

    public void K1(@InterfaceC4331e int i10) {
        L1(i().getResources().getTextArray(i10));
    }

    public void L1(CharSequence[] charSequenceArr) {
        this.f115446Z = charSequenceArr;
    }

    public void M1(@InterfaceC4331e int i10) {
        N1(i().getResources().getTextArray(i10));
    }

    public void N1(CharSequence[] charSequenceArr) {
        this.f115447a0 = charSequenceArr;
    }

    public void O1(String str) {
        boolean zEquals = TextUtils.equals(this.f115448b0, str);
        if (zEquals && this.f115450d0) {
            return;
        }
        this.f115448b0 = str;
        this.f115450d0 = true;
        w0(str);
        if (zEquals) {
            return;
        }
        X();
    }

    public void P1(int i10) {
        CharSequence[] charSequenceArr = this.f115447a0;
        if (charSequenceArr != null) {
            O1(charSequenceArr[i10].toString());
        }
    }

    @Override // androidx.preference.Preference
    public void a1(@Nullable CharSequence charSequence) {
        super.a1(charSequence);
        if (charSequence == null) {
            this.f115449c0 = null;
        } else {
            this.f115449c0 = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    public Object h0(@NonNull TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    @Override // androidx.preference.Preference
    public void l0(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.l0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.l0(savedState.getSuperState());
        O1(savedState.mValue);
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
        savedState.mValue = I1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void n0(Object obj) {
        O1(C((String) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String mValue;

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
            this.mValue = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.mValue);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, D0.n.a(context, w.a.f115778k, R.attr.dialogPreferenceStyle), 0);
    }

    public ListPreference(@NonNull Context context) {
        this(context, null);
    }
}
