package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,88:1\n55#1,12:89\n84#1,3:101\n55#1,12:104\n84#1,3:116\n55#1,12:119\n84#1,3:131\n*S KotlinDebug\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n30#1:89,12\n30#1:101,3\n39#1:104,12\n39#1:116,3\n48#1:119,12\n48#1:131,3\n*E\n"})
public final class TextViewKt {

    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l<Editable, L0> f112086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.r<CharSequence, Integer, Integer, Integer, L0> f112087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ed.r<CharSequence, Integer, Integer, Integer, L0> f112088c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ed.l<? super Editable, L0> lVar, ed.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, L0> rVar, ed.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, L0> rVar2) {
            this.f112086a = lVar;
            this.f112087b = rVar;
            this.f112088c = rVar2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f112086a.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f112087b.x(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f112088c.x(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    @V({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n59#2:83\n62#3:84\n*E\n"})
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l f112092a;

        public b(ed.l lVar) {
            this.f112092a = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f112092a.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @V({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n63#2:83\n62#3:84\n*E\n"})
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.r f112093a;

        public c(ed.r rVar) {
            this.f112093a = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f112093a.x(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @V({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n*L\n1#1,82:1\n63#2:83\n59#3:84\n*E\n"})
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.r f112094a;

        public d(ed.r rVar) {
            this.f112094a = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f112094a.x(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    @NotNull
    public static final TextWatcher a(@NotNull TextView textView, @NotNull ed.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, L0> rVar, @NotNull ed.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, L0> rVar2, @NotNull ed.l<? super Editable, L0> lVar) {
        a aVar = new a(lVar, rVar, rVar2);
        textView.addTextChangedListener(aVar);
        return aVar;
    }

    public static /* synthetic */ TextWatcher b(TextView textView, ed.r rVar, ed.r rVar2, ed.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = new ed.r<CharSequence, Integer, Integer, Integer, L0>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$1
                public final void e(CharSequence charSequence, int i11, int i12, int i13) {
                }

                @Override // ed.r
                public /* bridge */ /* synthetic */ L0 x(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    num.intValue();
                    num2.intValue();
                    num3.intValue();
                    return L0.f217464a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            rVar2 = new ed.r<CharSequence, Integer, Integer, Integer, L0>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$2
                public final void e(CharSequence charSequence, int i11, int i12, int i13) {
                }

                @Override // ed.r
                public /* bridge */ /* synthetic */ L0 x(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    num.intValue();
                    num2.intValue();
                    num3.intValue();
                    return L0.f217464a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            lVar = new ed.l<Editable, L0>() { // from class: androidx.core.widget.TextViewKt$addTextChangedListener$3
                public final void e(Editable editable) {
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(Editable editable) {
                    return L0.f217464a;
                }
            };
        }
        a aVar = new a(lVar, rVar, rVar2);
        textView.addTextChangedListener(aVar);
        return aVar;
    }

    @NotNull
    public static final TextWatcher c(@NotNull TextView textView, @NotNull ed.l<? super Editable, L0> lVar) {
        b bVar = new b(lVar);
        textView.addTextChangedListener(bVar);
        return bVar;
    }

    @NotNull
    public static final TextWatcher d(@NotNull TextView textView, @NotNull ed.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, L0> rVar) {
        c cVar = new c(rVar);
        textView.addTextChangedListener(cVar);
        return cVar;
    }

    @NotNull
    public static final TextWatcher e(@NotNull TextView textView, @NotNull ed.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, L0> rVar) {
        d dVar = new d(rVar);
        textView.addTextChangedListener(dVar);
        return dVar;
    }
}
