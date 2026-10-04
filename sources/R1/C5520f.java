package r1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.t;
import e.T;

/* JADX INFO: renamed from: r1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5520f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f227138a;

    /* JADX INFO: renamed from: r1.f$a */
    @T(19)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f227139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5518d f227140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f227141c = true;

        public a(TextView textView) {
            this.f227139a = textView;
            this.f227140b = new C5518d(textView);
        }

        @Override // r1.C5520f.b
        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return !this.f227141c ? i(inputFilterArr) : g(inputFilterArr);
        }

        @Override // r1.C5520f.b
        public boolean b() {
            return this.f227141c;
        }

        @Override // r1.C5520f.b
        public void c(boolean z10) {
            if (z10) {
                e();
            }
        }

        @Override // r1.C5520f.b
        public void d(boolean z10) {
            this.f227141c = z10;
            e();
            l();
        }

        @Override // r1.C5520f.b
        public void e() {
            this.f227139a.setTransformationMethod(f(this.f227139a.getTransformationMethod()));
        }

        @Override // r1.C5520f.b
        @Nullable
        public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
            return this.f227141c ? m(transformationMethod) : k(transformationMethod);
        }

        @NonNull
        public final InputFilter[] g(@NonNull InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f227140b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f227140b;
            return inputFilterArr2;
        }

        public final SparseArray<InputFilter> h(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof C5518d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        @NonNull
        public final InputFilter[] i(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayH = h(inputFilterArr);
            if (sparseArrayH.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayH.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayH.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public void j(boolean z10) {
            this.f227141c = z10;
        }

        @Nullable
        public final TransformationMethod k(@Nullable TransformationMethod transformationMethod) {
            return transformationMethod instanceof C5522h ? ((C5522h) transformationMethod).a() : transformationMethod;
        }

        public final void l() {
            this.f227139a.setFilters(a(this.f227139a.getFilters()));
        }

        @NonNull
        public final TransformationMethod m(@Nullable TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C5522h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C5522h(transformationMethod);
        }
    }

    /* JADX INFO: renamed from: r1.f$c */
    @T(19)
    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f227142a;

        public c(TextView textView) {
            this.f227142a = new a(textView);
        }

        @Override // r1.C5520f.b
        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return g() ? inputFilterArr : this.f227142a.a(inputFilterArr);
        }

        @Override // r1.C5520f.b
        public boolean b() {
            return this.f227142a.b();
        }

        @Override // r1.C5520f.b
        public void c(boolean z10) {
            if (g()) {
                return;
            }
            this.f227142a.c(z10);
        }

        @Override // r1.C5520f.b
        public void d(boolean z10) {
            if (g()) {
                this.f227142a.j(z10);
            } else {
                this.f227142a.d(z10);
            }
        }

        @Override // r1.C5520f.b
        public void e() {
            if (g()) {
                return;
            }
            this.f227142a.e();
        }

        @Override // r1.C5520f.b
        @Nullable
        public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
            return g() ? transformationMethod : this.f227142a.f(transformationMethod);
        }

        public final boolean g() {
            return !androidx.emoji2.text.c.q();
        }
    }

    public C5520f(@NonNull TextView textView) {
        this(textView, true);
    }

    @NonNull
    public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.f227138a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f227138a.b();
    }

    public void c(boolean z10) {
        this.f227138a.c(z10);
    }

    public void d(boolean z10) {
        this.f227138a.d(z10);
    }

    public void e() {
        this.f227138a.e();
    }

    @Nullable
    public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
        return this.f227138a.f(transformationMethod);
    }

    public C5520f(@NonNull TextView textView, boolean z10) {
        t.m(textView, "textView cannot be null");
        if (z10) {
            this.f227138a = new a(textView);
        } else {
            this.f227138a = new c(textView);
        }
    }

    /* JADX INFO: renamed from: r1.f$b */
    public static class b {
        public boolean b() {
            return false;
        }

        public void e() {
        }

        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public void c(boolean z10) {
        }

        public void d(boolean z10) {
        }

        @Nullable
        public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }
}
