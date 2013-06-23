package com.icode.core.model;

import com.icode.core.shared.GuidGenerator;
import com.icode.core.shared.JodaTimeUtils;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-22
 * Time: 下午4:09
 */
@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer version;

    @Column
    private Boolean active = Boolean.TRUE;

    @Column
    private String guid = GuidGenerator.generate();

    @Column(name = "create_time", columnDefinition = "datetime")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime createTime = JodaTimeUtils.now();

    @Column(name = "last_modify_time", columnDefinition = "datetime")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime lastModifyTime = JodaTimeUtils.now();
}
