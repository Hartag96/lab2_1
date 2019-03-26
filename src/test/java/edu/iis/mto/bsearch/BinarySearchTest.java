package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BinarySearchTest {

    private BinarySearch binarySearch;

    @Test
    public void OneElementSequenceValueInSequence() {
        int [] seq = {1};
        int value = 1;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertTrue(searchResult.isFound());
    }

    @Test
    public void OneElementSequenceValueNotInSequence() {
        int [] seq = {1};
        int value = -1;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertFalse(searchResult.isFound());
    }

    @Test
    public void MultiElementSequenceValueFirstInSequence() {
        int [] seq = {1,2,3};
        int value = 1;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertTrue(searchResult.isFound());
        Assert.assertThat(0, is(equalTo(searchResult.getPosition())));
    }

    @Test
    public void MultiElementSequenceValueLastInSequence() {
        int [] seq = {1,2,3};
        int value = 3;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertTrue(searchResult.isFound());
        Assert.assertThat(seq.length-1, is(equalTo(searchResult.getPosition())));
    }

    @Test
    public void MultiElementSequenceValueCenterInSequence() {
        int [] seq = {1,2,3};
        int value = 2;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertTrue(searchResult.isFound());
        Assert.assertThat((seq.length - 1) / 2, is(equalTo(searchResult.getPosition())));
    }

    @Test
    public void MultiElementSequenceValueNotInSequence() {
        int [] seq = {1,2,3};
        int value = -1;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertFalse(searchResult.isFound());
        Assert.assertThat(-1, is(equalTo(searchResult.getPosition())));
    }

}
