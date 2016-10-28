package com.omeletlab.sa.thirdlecturerecycleview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by akashs on 10/26/16.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private ArrayList<Product> productList;

    public ProductAdapter(ArrayList<Product> productList) {
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        ProductViewHolder pv = new ProductViewHolder(v);
        return pv;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.pNameTV.setText(productList.get(position).getProductName());
        holder.pStockTV.setText(""+productList.get(position).getProductStock());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder{

        CardView cv;
        TextView pNameTV;
        TextView pStockTV;

        public ProductViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            pNameTV = (TextView) itemView.findViewById(R.id.productName);
            pStockTV = (TextView) itemView.findViewById(R.id.productStock);
        }
    }
}








