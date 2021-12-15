/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;

/**
 * A TopicSearchData.
 */
@Entity
@Table(name = "topic_search_data")
public class TopicSearchData extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "topic_id", nullable = false)
    private Long topicId;

    @Column(name = "raw_data")
    private String rawData;

    @NotNull
    @Column(name = "locale", nullable = false)
    private String locale;

    @Column(name = "search_data")
    private String searchData;

    @Column(name = "version")
    private Integer version;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTopicId() {
        return topicId;
    }

    public TopicSearchData topicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getRawData() {
        return rawData;
    }

    public TopicSearchData rawData(String rawData) {
        this.rawData = rawData;
        return this;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public String getLocale() {
        return locale;
    }

    public TopicSearchData locale(String locale) {
        this.locale = locale;
        return this;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getSearchData() {
        return searchData;
    }

    public TopicSearchData searchData(String searchData) {
        this.searchData = searchData;
        return this;
    }

    public void setSearchData(String searchData) {
        this.searchData = searchData;
    }

    public Integer getVersion() {
        return version;
    }

    public TopicSearchData version(Integer version) {
        this.version = version;
        return this;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopicSearchData)) {
            return false;
        }
        return id != null && id.equals(((TopicSearchData) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TopicSearchData{" +
            "id=" + getId() +
            ", topicId=" + getTopicId() +
            ", rawData='" + getRawData() + "'" +
            ", locale='" + getLocale() + "'" +
            ", searchData='" + getSearchData() + "'" +
            ", version=" + getVersion() +
            "}";
    }
}
