package com.sporty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sporty.dao.PurchaseItemDAO;
import com.sporty.entity.PurchaseItem;

@Component
public class PurchaseItemService {

	@Autowired
	private PurchaseItemDAO purchaseItemDAO;

	@Transactional
	public PurchaseItem getItemById(long id) {
		return purchaseItemDAO.getItemById(id);

	}

	@Transactional
	public List<PurchaseItem> getAllItemsByPurchaseId(long purchaseId) {
		return purchaseItemDAO.getAllItemsByPurchaseId(purchaseId);
	}

	@Transactional
	public void updateItem(PurchaseItem item) {
		purchaseItemDAO.updateItem(item);
	}

	@Transactional
	public void deleteItem(long id) {
		purchaseItemDAO.deleteAllItemsForPurchaseId(id);
	}

	@Transactional
	public void deleteAllItemsForPurchaseId(long purchaseId) {
		purchaseItemDAO.deleteAllItemsForPurchaseId(purchaseId);
	}

}
