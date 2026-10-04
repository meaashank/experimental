package com.prism.gaia.naked.core;

import android.util.Log;
import com.prism.commons.utils.l0;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedDouble;
import com.prism.gaia.naked.entity.NakedFloat;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedLong;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticBoolean;
import com.prism.gaia.naked.entity.NakedStaticDouble;
import com.prism.gaia.naked.entity.NakedStaticFloat;
import com.prism.gaia.naked.entity.NakedStaticInt;
import com.prism.gaia.naked.entity.NakedStaticLong;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class InitOnceField<T> extends AbstractInitOnce<T> {
    private static final String TAG = l0.b("InitOnceField");
    private String fieldName;
    private Class<?> fieldOwnerClass;

    public static class InitOneceInstanceBooleanField extends InitOnceField<NakedBoolean> {
        public InitOneceInstanceBooleanField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ NakedBoolean onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedBoolean onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedBoolean(cls, str);
        }
    }

    public static class InitOneceInstanceDoubleField extends InitOnceField<NakedDouble> {
        public InitOneceInstanceDoubleField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ NakedDouble onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedDouble onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedDouble(cls, str);
        }
    }

    public static class InitOneceInstanceFloatField extends InitOnceField<NakedFloat> {
        public InitOneceInstanceFloatField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ NakedFloat onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedFloat onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedFloat(cls, str);
        }
    }

    public static class InitOneceInstanceIntField extends InitOnceField<NakedInt> {
        public InitOneceInstanceIntField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ NakedInt onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedInt onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedInt(cls, str);
        }
    }

    public static class InitOneceInstanceLongField extends InitOnceField<NakedLong> {
        public InitOneceInstanceLongField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ NakedLong onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedLong onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedLong(cls, str);
        }
    }

    public static class InitOneceInstanceObjectField<T> extends InitOnceField<NakedObject<T>> {
        public InitOneceInstanceObjectField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedObject<T> onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedObject<>(cls, str);
        }
    }

    public static class InitOneceStaticBooleanField extends InitOnceField<NakedStaticBoolean> {
        public InitOneceStaticBooleanField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ NakedStaticBoolean onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedStaticBoolean onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedStaticBoolean(cls, str);
        }
    }

    public static class InitOneceStaticDoubleField extends InitOnceField<NakedStaticDouble> {
        public InitOneceStaticDoubleField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ NakedStaticDouble onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedStaticDouble onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedStaticDouble(cls, str);
        }
    }

    public static class InitOneceStaticFloatField extends InitOnceField<NakedStaticFloat> {
        public InitOneceStaticFloatField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ NakedStaticFloat onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedStaticFloat onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedStaticFloat(cls, str);
        }
    }

    public static class InitOneceStaticIntField extends InitOnceField<NakedStaticInt> {
        public InitOneceStaticIntField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ NakedStaticInt onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedStaticInt onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedStaticInt(cls, str);
        }
    }

    public static class InitOneceStaticLongField extends InitOnceField<NakedStaticLong> {
        public InitOneceStaticLongField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ NakedStaticLong onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedStaticLong onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedStaticLong(cls, str);
        }
    }

    public static class InitOneceStaticObjectField<T> extends InitOnceField<NakedStaticObject<T>> {
        public InitOneceStaticObjectField(Class<?> cls, String str) {
            super(cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public /* bridge */ /* synthetic */ Object onInit(Class cls, String str) throws NoSuchFieldException {
            return onInit((Class<?>) cls, str);
        }

        @Override // com.prism.gaia.naked.core.InitOnceField
        public NakedStaticObject<T> onInit(Class<?> cls, String str) throws NoSuchFieldException {
            return new NakedStaticObject<>(cls, str);
        }
    }

    public InitOnceField(Class<?> cls, String str) {
        this.fieldOwnerClass = cls;
        this.fieldName = str;
    }

    @Override // com.prism.gaia.naked.core.AbstractInitOnce
    public T onInit() {
        try {
            return onInit(this.fieldOwnerClass, this.fieldName);
        } catch (NoSuchFieldException e10) {
            Log.e(TAG, "No such field", e10);
            return null;
        }
    }

    public abstract T onInit(Class<?> cls, String str) throws NoSuchFieldException;
}
