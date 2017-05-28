
package com.tahutelorcommunity.bukapagar.Model.Dompet.History;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tahutelorcommunity.bukapagar.Model.Dompet.Mutation.MutationHistory;
import com.tahutelorcommunity.bukapagar.Model.Dompet.WithdrawalsHistory.History;

import java.util.List;

public class DompetHistory {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("balance")
    @Expose
    private Integer balance;
    @SerializedName("withdrawable_balance")
    @Expose
    private Integer withdrawableBalance;
    @SerializedName("topup_history")
    @Expose
    private List<Object> topupHistory = null;
    @SerializedName("withdrawal_history")
    @Expose
    private List<History> withdrawalHistory = null;
    @SerializedName("mutation_history")
    @Expose
    private List<MutationHistory> mutationHistory = null;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DompetHistory() {
    }

    /**
     * 
     * @param message
     * @param withdrawableBalance
     * @param balance
     * @param mutationHistory
     * @param status
     * @param withdrawalHistory
     * @param topupHistory
     */
    public DompetHistory(String status, Integer balance, Integer withdrawableBalance, List<Object> topupHistory, List<History> withdrawalHistory, List<MutationHistory> mutationHistory, Object message) {
        super();
        this.status = status;
        this.balance = balance;
        this.withdrawableBalance = withdrawableBalance;
        this.topupHistory = topupHistory;
        this.withdrawalHistory = withdrawalHistory;
        this.mutationHistory = mutationHistory;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getWithdrawableBalance() {
        return withdrawableBalance;
    }

    public void setWithdrawableBalance(Integer withdrawableBalance) {
        this.withdrawableBalance = withdrawableBalance;
    }

    public List<Object> getTopupHistory() {
        return topupHistory;
    }

    public void setTopupHistory(List<Object> topupHistory) {
        this.topupHistory = topupHistory;
    }

    public List<History> getWithdrawalHistory() {
        return withdrawalHistory;
    }

    public void setWithdrawalHistory(List<History> withdrawalHistory) {
        this.withdrawalHistory = withdrawalHistory;
    }

    public List<MutationHistory> getMutationHistory() {
        return mutationHistory;
    }

    public void setMutationHistory(List<MutationHistory> mutationHistory) {
        this.mutationHistory = mutationHistory;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
