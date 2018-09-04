package datebase;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.mysql.jdbc.PreparedStatement;


public class getdatas {
//	    获取数据库连接
	    public static Connection getConnection(String url, String username, String password) throws ClassNotFoundException {
	        Connection conn=null;
			try {
				 Class.forName("com.mysql.jdbc.Driver");
	            conn=DriverManager.getConnection(url, username, password);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return conn;
	    }
	    public static ResultSet execSql(String sql,String url,String username,String password) throws ClassNotFoundException{
	    	Connection conn = getConnection(url,username,password);
	    	PreparedStatement pstmt;
	    	ResultSet rs = null;
	    	 try {
	    	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	    	        rs = pstmt.executeQuery();
	    	    } catch (SQLException e) {
	    	        e.printStackTrace();
	    	    }
			return rs;
	     }
	    public static String resultSetToJson(ResultSet rs) throws SQLException,JSONException  
	    {  
	       // json数组  
	       JSONArray array = new JSONArray();  	        
	       // 获取列数  
	       ResultSetMetaData metaData = rs.getMetaData();  
	       int columnCount = metaData.getColumnCount();  	        
	       // 遍历ResultSet中的每条数据  
	        while (rs.next()) {  
	            JSONObject jsonObj = new JSONObject();               
	            // 遍历每一列  
	            for (int i = 1; i <= columnCount; i++) {  
	                String columnName =metaData.getColumnLabel(i);  
	                String value = rs.getString(columnName);  
	                jsonObj.put(columnName, value);  
	            }   
	            array.put(jsonObj);   
	        }  	        
	       return array.toString();  
	    }
   }

