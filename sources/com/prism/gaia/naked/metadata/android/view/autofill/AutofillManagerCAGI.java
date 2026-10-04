package com.prism.gaia.naked.metadata.android.view.autofill;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.n;
import android.os.IInterface;
import android.view.autofill.AutofillManager;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public class AutofillManagerCAGI {

    @l
    @i(AutofillManager.class)
    public interface O26 extends ClassAccessor {
        @n("mService")
        NakedObject<IInterface> mService();
    }
}
