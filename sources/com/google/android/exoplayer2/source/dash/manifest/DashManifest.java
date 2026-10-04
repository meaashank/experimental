package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.offline.FilterableManifest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DashManifest implements FilterableManifest<DashManifest, RepresentationKey> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;
    public final Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final List<Period> periods;
    public final long publishTimeMs;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;
    public final UtcTimingElement utcTiming;

    public DashManifest(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, UtcTimingElement utcTimingElement, Uri uri, List<Period> list) {
        this.availabilityStartTimeMs = j10;
        this.durationMs = j11;
        this.minBufferTimeMs = j12;
        this.dynamic = z10;
        this.minUpdatePeriodMs = j13;
        this.timeShiftBufferDepthMs = j14;
        this.suggestedPresentationDelayMs = j15;
        this.publishTimeMs = j16;
        this.utcTiming = utcTimingElement;
        this.location = uri;
        this.periods = list == null ? Collections.EMPTY_LIST : list;
    }

    private static ArrayList<AdaptationSet> copyAdaptationSets(List<AdaptationSet> list, LinkedList<RepresentationKey> linkedList) {
        RepresentationKey representationKeyPoll = linkedList.poll();
        int i10 = representationKeyPoll.periodIndex;
        ArrayList<AdaptationSet> arrayList = new ArrayList<>();
        do {
            int i11 = representationKeyPoll.adaptationSetIndex;
            AdaptationSet adaptationSet = list.get(i11);
            List<Representation> list2 = adaptationSet.representations;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(representationKeyPoll.representationIndex));
                representationKeyPoll = linkedList.poll();
                if (representationKeyPoll.periodIndex != i10) {
                    break;
                }
            } while (representationKeyPoll.adaptationSetIndex == i11);
            arrayList.add(new AdaptationSet(adaptationSet.f150745id, adaptationSet.type, arrayList2, adaptationSet.accessibilityDescriptors, adaptationSet.supplementalProperties));
        } while (representationKeyPoll.periodIndex == i10);
        linkedList.addFirst(representationKeyPoll);
        return arrayList;
    }

    public final Period getPeriod(int i10) {
        return this.periods.get(i10);
    }

    public final int getPeriodCount() {
        return this.periods.size();
    }

    public final long getPeriodDurationMs(int i10) {
        long j10;
        long j11;
        if (i10 == this.periods.size() - 1) {
            j10 = this.durationMs;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = this.periods.get(i10).startMs;
        } else {
            j10 = this.periods.get(i10 + 1).startMs;
            j11 = this.periods.get(i10).startMs;
        }
        return j10 - j11;
    }

    public final long getPeriodDurationUs(int i10) {
        return C.msToUs(getPeriodDurationMs(i10));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* JADX INFO: renamed from: copy */
    public final DashManifest copy2(List<RepresentationKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new RepresentationKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= getPeriodCount()) {
                break;
            }
            if (((RepresentationKey) linkedList.peek()).periodIndex != i10) {
                long periodDurationMs = getPeriodDurationMs(i10);
                if (periodDurationMs != -9223372036854775807L) {
                    j10 += periodDurationMs;
                }
            } else {
                Period period = getPeriod(i10);
                arrayList.add(new Period(period.f150747id, period.startMs - j10, copyAdaptationSets(period.adaptationSets, linkedList), period.eventStreams));
            }
            i10++;
        }
        long j11 = this.durationMs;
        return new DashManifest(this.availabilityStartTimeMs, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.minBufferTimeMs, this.dynamic, this.minUpdatePeriodMs, this.timeShiftBufferDepthMs, this.suggestedPresentationDelayMs, this.publishTimeMs, this.utcTiming, this.location, arrayList);
    }
}
