var HtmlWebpackPlugin = require('html-webpack-plugin');

config.plugins.push(new HtmlWebpackPlugin({
  title: 'My App',
  template: 'web/index.html'
}));