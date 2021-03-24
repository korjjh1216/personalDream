package com.example.demo.auction.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.chat.domain.Chat;
import com.example.demo.stock.domain.Item;
import com.example.demo.uss.domain.User;

@Entity
@Table(name="auctions")
public class Auction {

    @Id
    @GeneratedValue
    @Column(name="auction_no")
    private long auctionNo;

    @Column(name="reg_date")
    private Date regDate;
    
    @Column(name="bid_price")
    private String bidPrice;

    @Column(name="current_price")
    private String currentPrice;

    @Column(name="bid")
    private String bid;

}
