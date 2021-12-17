import React from "react";

import { Rodape, Copy } from './styles';

const Footer: React.FC = () => {
    const ano = new Date().getFullYear()
    return (
        <Rodape>
            <a style={{ textDecoration: "none" }} href="https://github.com/AdrielCavalcante/WeTubeBot" target="_blank" rel="noreferrer"><Copy>WeTubeBot &copy; - {ano}</Copy></a>
        </Rodape>
    );
};

export default Footer;