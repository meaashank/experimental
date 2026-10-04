package com.inmobi.unifiedId;

import java.util.HashMap;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class InMobiUserDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiUserDataTypes f153701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiUserDataTypes f153702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f153703c;

    @V({"SMAP\nInMobiUserDataModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMobiUserDataModel.kt\ncom/inmobi/unifiedId/InMobiUserDataModel$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InMobiUserDataTypes f153704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InMobiUserDataTypes f153705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashMap f153706c;

        @NotNull
        public final InMobiUserDataModel build() {
            return new InMobiUserDataModel(this.f153704a, this.f153705b, this.f153706c);
        }

        @NotNull
        public final Builder emailId(@Nullable InMobiUserDataTypes inMobiUserDataTypes) {
            this.f153705b = inMobiUserDataTypes;
            return this;
        }

        @NotNull
        public final Builder extras(@Nullable HashMap<String, String> map) {
            this.f153706c = map;
            return this;
        }

        @NotNull
        public final Builder phoneNumber(@Nullable InMobiUserDataTypes inMobiUserDataTypes) {
            this.f153704a = inMobiUserDataTypes;
            return this;
        }
    }

    public InMobiUserDataModel(@Nullable InMobiUserDataTypes inMobiUserDataTypes, @Nullable InMobiUserDataTypes inMobiUserDataTypes2, @Nullable HashMap<String, String> map) {
        this.f153701a = inMobiUserDataTypes;
        this.f153702b = inMobiUserDataTypes2;
        this.f153703c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InMobiUserDataModel copy$default(InMobiUserDataModel inMobiUserDataModel, InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inMobiUserDataTypes = inMobiUserDataModel.f153701a;
        }
        if ((i10 & 2) != 0) {
            inMobiUserDataTypes2 = inMobiUserDataModel.f153702b;
        }
        if ((i10 & 4) != 0) {
            map = inMobiUserDataModel.f153703c;
        }
        return inMobiUserDataModel.copy(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    @Nullable
    public final InMobiUserDataTypes component1() {
        return this.f153701a;
    }

    @Nullable
    public final InMobiUserDataTypes component2() {
        return this.f153702b;
    }

    @Nullable
    public final HashMap<String, String> component3() {
        return this.f153703c;
    }

    @NotNull
    public final InMobiUserDataModel copy(@Nullable InMobiUserDataTypes inMobiUserDataTypes, @Nullable InMobiUserDataTypes inMobiUserDataTypes2, @Nullable HashMap<String, String> map) {
        return new InMobiUserDataModel(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataModel)) {
            return false;
        }
        InMobiUserDataModel inMobiUserDataModel = (InMobiUserDataModel) obj;
        return G.g(this.f153701a, inMobiUserDataModel.f153701a) && G.g(this.f153702b, inMobiUserDataModel.f153702b) && G.g(this.f153703c, inMobiUserDataModel.f153703c);
    }

    @Nullable
    public final InMobiUserDataTypes getEmailId() {
        return this.f153702b;
    }

    @Nullable
    public final HashMap<String, String> getExtras() {
        return this.f153703c;
    }

    @Nullable
    public final InMobiUserDataTypes getPhoneNumber() {
        return this.f153701a;
    }

    public int hashCode() {
        InMobiUserDataTypes inMobiUserDataTypes = this.f153701a;
        int iHashCode = (inMobiUserDataTypes == null ? 0 : inMobiUserDataTypes.hashCode()) * 31;
        InMobiUserDataTypes inMobiUserDataTypes2 = this.f153702b;
        int iHashCode2 = (iHashCode + (inMobiUserDataTypes2 == null ? 0 : inMobiUserDataTypes2.hashCode())) * 31;
        HashMap map = this.f153703c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InMobiUserDataModel(phoneNumber=" + this.f153701a + ", emailId=" + this.f153702b + ", extras=" + this.f153703c + ')';
    }
}
