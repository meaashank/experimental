package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AdaptationSet {
    public static final int ID_UNSET = -1;
    public final List<Descriptor> accessibilityDescriptors;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final int f150745id;
    public final List<Representation> representations;
    public final List<Descriptor> supplementalProperties;
    public final int type;

    public AdaptationSet(int i10, int i11, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3) {
        this.f150745id = i10;
        this.type = i11;
        this.representations = Collections.unmodifiableList(list);
        this.accessibilityDescriptors = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.supplementalProperties = list3 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list3);
    }
}
